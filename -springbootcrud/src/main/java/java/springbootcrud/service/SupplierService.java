package java.springbootcrud.service;

import java.springbootcrud.repository.SupplierRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import java.springbootcrud.model.*;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Service
public class SupplierService {
      
	@Autowired
	private SupplierRepository suprepository;
	
	public List<Supplier> getAllSuppliers(){
		
	      return suprepository.findAll();
	}
	
	public ResponseEntity<String> createSupplier(Supplier supplier) {
	    String message = null;
		try {
			 suprepository.save(supplier);
		   message = "the data is saved";
		}catch(DataAccessException ex) {
			 new DataIntegrityViolationException("YOU CANNOT PUT NULL VALUE IN companyName AND vatNumber");			
		}
		return ResponseEntity.status(HttpStatus.OK).body(message);
	}
	
	public ResponseEntity<Supplier> getSupplier(long id){
		Supplier supplier = suprepository.findById(id).get();
		
		return ResponseEntity.status(HttpStatus.OK).body(supplier);
	}
	
	public ResponseEntity<Supplier> updateSupplier(long id, Supplier supplier) {
		Supplier databaseSupplier = suprepository.findById(id).get();
		databaseSupplier.setCity(supplier.getCity());
		databaseSupplier.setCompanyName(supplier.getCompanyName());
		databaseSupplier.setCountry(supplier.getCountry());
		databaseSupplier.setFirstName(supplier.getFirstName());
		databaseSupplier.setIrsOffice(supplier.getIrsOffice());
		databaseSupplier.setLastName(supplier.getLastName());
		databaseSupplier.setVatNumber(supplier.getVatNumber());
		databaseSupplier.setZipCode(supplier.getZipCode());
		Supplier updateSupplier=suprepository.save(databaseSupplier);
		
		return ResponseEntity.status(HttpStatus.OK).body(updateSupplier);
	}
	
	public ResponseEntity<String> deleteSupplier(long id) {
		Supplier supplier = suprepository.findById(id).get();
		  
		 suprepository.delete(supplier);
		 String message = "the data is deleted";
		 return ResponseEntity.status(200).body(message);
	}
}
