package com.rubikok.model;

import com.rubikok.entity.Empleado;
import com.rubikok.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository repository;

    public Empleado createEmpleado(Empleado empleado){
        return repository.save(empleado);
    }

    public List<Empleado> listAll(){
        return repository.findAll();
    }

    public Empleado updateEmpleado(Empleado empleado){
        Empleado existingEmpleado = repository.findById(empleado.getId()).orElse(null);
        existingEmpleado.setClave(empleado.getClave());
        return repository.save(existingEmpleado);
    }
    public String deleteEmpleado(Integer id){
        repository.deleteById(id);
        return "Empleado con Codigo: "+id+" Eliminado";
    }

}
