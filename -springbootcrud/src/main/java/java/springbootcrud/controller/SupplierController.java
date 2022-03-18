package java.springbootcrud.controller;

import java.springbootcrud.service.SupplierService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.springbootcrud.model.*;

@Controller
@RequestMapping("/Supplier")
public class SupplierController {
     
	@Autowired
	private SupplierService supservice;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Supplier> getAllSuppliers(){
		return supservice.getAllSuppliers();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseEntity<String> createSupplier(Supplier supplier) {
		return supservice.createSupplier(supplier);
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Supplier> updateSupplier(@PathVariable long id, @RequestBody Supplier supplier) {
		return supservice.updateSupplier(id,supplier);
	}

	@RequestMapping(value="/get/{id}",method=RequestMethod.GET)
	public ResponseEntity<Supplier> getSupplier(@PathVariable long id) {
		return supservice.getSupplier(id);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteSupplier(@PathVariable long id) {
		return supservice.deleteSupplier(id);
	}
	
	
}
