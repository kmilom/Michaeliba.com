package michaeliba.com.services;

import java.util.List;
import michaeliba.com.dao.AssambliesDao;
import michaeliba.com.domain.Assamblies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

class AssambliesServiceImpl implements AssambliesServices{
    
    @Autowired
    private AssambliesDao assamblyDao;

    @Override
    @Transactional(readOnly = true)
    public List<Assamblies> assamblyList() {
        return (List<Assamblies>) assamblyDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Assamblies asamblea) {
        assamblyDao.save(asamblea);
    }

    @Override
    @Transactional
    public void eliminar(Assamblies asamblea) {
        assamblyDao.delete(asamblea);
    }

    @Override
    @Transactional(readOnly = true)
    public Assamblies buscarAssamblies(Assamblies asamblea) {
        return assamblyDao.findById(asamblea.getId_assamblies()).orElse(null);
    }
    
}
