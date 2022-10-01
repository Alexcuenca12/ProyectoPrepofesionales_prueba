package com.ista.tecazuay.proyecto.models.service.implement;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.tecazuay.proyecto.models.primary.entity.Usuario;
import com.ista.tecazuay.proyecto.models.primary.entity.UsuarioRol;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IRolRepositoryDao;
import com.ista.tecazuay.proyecto.models.repository.primary.dao.IUsuarioDao;
import com.ista.tecazuay.proyecto.models.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao UsuarioDao;

	@Autowired
	private IRolRepositoryDao rolRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {

		return (List<Usuario>) UsuarioDao.findAll();
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
		Usuario usuarioLocal = UsuarioDao.findByCedula(usuario.getCedula());
		if (usuarioLocal != null) {
			System.out.println("El usuario ya existe");
			throw new Exception("El usuario ya esta presente");
		} else {
			for (UsuarioRol usuarioRol : usuarioRoles) {
				rolRepository.save(usuarioRol.getRol());
			}
			usuario.getUsuarioRoles().addAll(usuarioRoles);
			usuarioLocal = UsuarioDao.save(usuario);
		}
		return usuarioLocal;
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {

		return UsuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		UsuarioDao.deleteById(id);
	}
}
