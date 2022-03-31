package mypkg.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import mypkg.entity.Product;
import mypkg.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService pService;
	
	@PostMapping("/addproduct")
	public Product addproduct(@RequestBody Product product)
	{
		return pService.saveProduct(product);
	}
	@PostMapping("/addmultipleproduct")
	public List<Product> addmultipleproduct(@RequestBody List<Product> products)
	{
		return pService.savemultipleProduct(products);
	}
	@GetMapping("/findAll")
	public List<Product> FindAllproduct(@RequestBody List<Product> products)
	{
		return pService.findallProduct(products);
	}
	@GetMapping("/findSpecific/{pname}")
	public Product FindSpecificproduct(@PathVariable String pname)
	{
		return pService.findspecificProduct(pname);
	}
	@GetMapping("/findid/{pid}")
	public Product FindSpecificproduct(@PathVariable int pid)
	{
		return pService.findbyid(pid);
	}
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		return pService.update(product);
	}
	@PutMapping("/delete/{pid}")
	public String updateProduct(@PathVariable int pid)
	{
		return pService.delete(pid);
	}
}
