package com.rubikok.controler;

import com.rubikok.entity.Empleado;
import com.rubikok.model.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.createEmpleado(empleado);
    }

    @GetMapping("/empleados")
    public List<Empleado> findAllEmpleados() {
        return empleadoService.listAll();
    }
}
