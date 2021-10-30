package com.ms.repositories;

import com.ms.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel,Long> {
}
