package com.hendisantika.loggingfilter3.repository;

import com.hendisantika.loggingfilter3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-logging-filter3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/29/23
 * Time: 08:04
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Modifying
    @Query(value = "update Student set address = ?1 where id = ?2")
    Integer updateAddressById(String address, Integer Id);
}
