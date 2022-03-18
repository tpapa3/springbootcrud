package java.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.springbootcrud.model.*;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long>{
       
	Supplier findBycompanyName(String companyName);
	Supplier findByvatNumber(String vatNumber);
}
