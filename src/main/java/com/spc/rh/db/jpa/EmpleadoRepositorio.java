package com.spc.rh.db.jpa;

import com.spc.rh.db.orm.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
