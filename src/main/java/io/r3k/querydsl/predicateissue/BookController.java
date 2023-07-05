package io.r3k.querydsl.predicateissue;

import com.querydsl.core.types.Predicate;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BookController {
    private final BookRepository bookRepository;
    @GetMapping("/books")
    @Operation(description = "Find all books.")
    public Iterable<Book> getBooks(@QuerydslPredicate(root = Book.class, bindings = BookRepository.class)  Predicate predicate) {
        return bookRepository.findAll(predicate);
    }
}
