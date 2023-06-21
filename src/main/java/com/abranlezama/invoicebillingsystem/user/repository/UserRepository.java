package com.abranlezama.invoicebillingsystem.user.repository;

import com.abranlezama.invoicebillingsystem.user.User;

import java.util.Collection;

public interface UserRepository<T extends User> {
    T create(T user);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    boolean delete(Long id);
}
