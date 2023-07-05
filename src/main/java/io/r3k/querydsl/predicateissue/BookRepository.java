package io.r3k.querydsl.predicateissue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface BookRepository extends QuerydslPredicateExecutor<Book>, QuerydslBinderCustomizer<QBook>, JpaRepository<Book, Integer> {
    @Override
    default void customize(QuerydslBindings bindings, QBook root){

    }
}
