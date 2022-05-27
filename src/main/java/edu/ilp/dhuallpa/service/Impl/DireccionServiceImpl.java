package edu.ilp.dhuallpa.service.Impl;

import edu.ilp.dhuallpa.dao.IDireccionDao;
import edu.ilp.dhuallpa.entity.Direccion;
import edu.ilp.dhuallpa.service.Intef.IDireccionServiceIntef;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl implements IDireccionServiceIntef  {

    @Autowired
    IDireccionDao dao;

    @Override
    public Direccion obtenerDireccionPorCodigo(String codigo) {
        return this.dao.obtenerDireccionPorCodigo(codigo);
    }
}
