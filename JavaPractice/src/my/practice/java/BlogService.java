package my.practice.java;

public class BlogService{
	
	@Autowired
	BlogRepo blogRepo;
	
	public List<Blog> findAllBlog(){
		
		return blogRepo.findAll();
	}

}
