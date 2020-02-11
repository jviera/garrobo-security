/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.vieracode.garrobo.repository;

import mx.com.vieracode.garrobo.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User repository, for access to data the table User
 *
 * @author jviera.dev
 * @since Nov 2019
 * @version 1.0.0
 */
public interface UserRepository extends CrudRepository<User, String> {


}
