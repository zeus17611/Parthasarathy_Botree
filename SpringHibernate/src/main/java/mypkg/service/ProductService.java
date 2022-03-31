package mypkg.service;

import java.util.List;

import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypkg.entity.Product;
import mypkg.repository.ProductRepository;


@Service

public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	public Product saveProduct(Product product)
	{
		return productRepository.save(product);
	}
	public List<Product> savemultipleProduct(List<Product> products) {
		return productRepository.saveAll(products);
	}
	public List<Product> findallProduct(List<Product> products) {
		return productRepository.findAll();
	}
	public Product findspecificProduct(String pname) {
		
		return productRepository.findBypname(pname);
	}
	public Product findbyid(int pid) {
		return productRepository.getById(pid);
	}
	public Product update(Product product) {
		Product avl=productRepository.findById(product.getPid()).orElse(null);
		avl.setpPrice(product.getpPrice()/3);;
		return productRepository.save(avl);
	}
	public String delete(int pid) {
		productRepository.deleteById(pid);
		return "product deleted product id is"+pid;
	}
}
