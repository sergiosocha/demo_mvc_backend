package com.spc.rh.logica;

import com.spc.rh.db.orm.Empleado;

import java.util.List;

public interface IEmpleadoServicio {

    public List<Empleado> listaEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
