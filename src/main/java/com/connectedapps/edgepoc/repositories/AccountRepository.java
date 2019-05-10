package com.connectedapps.edgepoc.repositories;

import com.connectedapps.edgepoc.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long>, QueryByExampleExecutor<Account> {

}
