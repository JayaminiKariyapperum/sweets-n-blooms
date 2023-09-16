package lk.Sweetsnblooms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.Sweetsnblooms.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAllByCategory_Id(int id);
}
