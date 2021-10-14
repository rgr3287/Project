package com.psc.sample.q101.domain;

import com.psc.sample.q101.domain.upload;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.File;

public interface uploadRepository extends JpaRepository<upload,Long> {

    upload FindByFno (Long fno);
}
