package com.example.BookStore.repository;

import com.example.BookStore.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<Publisher, UUID> {
}
