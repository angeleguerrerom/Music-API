package com.spring.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.api.entity.Album;
import com.spring.api.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IAlbumsService serviceAlbums;
	
	
	@GetMapping("/albums")
	public List<Album>buscarTodos(){
		return serviceAlbums.buscarTodos() ;	
		
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
	serviceAlbums.guardar(album);
	return album;
		
	}
	
	@PutMapping("/albums")
	public Album modificar (@RequestBody Album album) {
	 serviceAlbums.guardar(album);
	 return album;
}
	
	@DeleteMapping("/albums/{id}")
	public String eliminar (@PathVariable("id") Integer idAlbum) {
		serviceAlbums.eliminar(idAlbum);
		return "El registro fue eliminado";
		
	}
	
	
	
}
