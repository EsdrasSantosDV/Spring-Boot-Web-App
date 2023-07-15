package esdras.spring.study.demo.bootstrap;

import esdras.spring.study.demo.domain.Author;
import esdras.spring.study.demo.domain.Book;
import esdras.spring.study.demo.domain.Publisher;
import esdras.spring.study.demo.repositories.AuthorRepository;
import esdras.spring.study.demo.repositories.BookRepository;
import esdras.spring.study.demo.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Ele e executado toda vez que o spring boot e executado
@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository)
    {
        this.authorRepository=authorRepository;
        this.bookRepository=bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author esdras=new Author();

        esdras.setFirstName("Esdras");
        esdras.setLastName("Evans");

        Book cleanArchetype=new Book();
        cleanArchetype.setTitle("Livro de Arquitetura");
        cleanArchetype.setIsbn("1241254");

        Author esdrasSaved=authorRepository.save(esdras);
        Book cleanArchetypeSaved=bookRepository.save(cleanArchetype);


        Author pedro=new Author();

        pedro.setFirstName("Pedro");
        pedro.setLastName("Pds");

        Book dindo=new Book();
        dindo.setTitle("Livro de Literatura");
        dindo.setIsbn("12125");

        Author pedroSaved=authorRepository.save(pedro);
        Book dindoSaved=bookRepository.save(dindo);

        esdrasSaved.getBooks().add(cleanArchetype);
        pedroSaved.getBooks().add(dindoSaved);
        //SO QUE ATE AQUI NÃO PERSISTEMOS A ASSOCIAÇÃO DOS AUTORES COM OS LIVROS

        //MAS AQUI PERSISTIMOS
        authorRepository.save(esdrasSaved);
        authorRepository.save(pedroSaved);

        Publisher newPublisher = new Publisher();

        newPublisher.setPublisherName("SFG Publishing");
        newPublisher.setAddress("Uberabadinha");
        newPublisher.setCity("St Petersburg");
        newPublisher.setZip("sdag");



        Publisher savedPublisher=publisherRepository.save(newPublisher);

        savedPublisher.getBooks().add(cleanArchetype);

        cleanArchetypeSaved.setPublisher(savedPublisher);

        bookRepository.save(cleanArchetypeSaved);
        publisherRepository.save(savedPublisher);

        System.out.println("In bootstrap");
        System.out.println("Author COunt"+authorRepository.count());
        System.out.println("Book COunt"+bookRepository.count());
        System.out.println("Publisher COunt"+publisherRepository.count());



    }
}
