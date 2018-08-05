package com.gether.bigdata.service;

import com.gether.bigdata.dao.dataobject.User;

import java.util.List;

/**
 * @author: myp
 * @date: 16/10/22
 */
public interface UserService {

  public void add(Long id, String name, Integer age);

  public User getById(Long id);

  public List<User> list();

  public void update(Long id, String name, Integer age);

  public void delete(Long id);

  public void deleteAll();
}
