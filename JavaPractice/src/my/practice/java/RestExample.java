package my.practice.java;

@RestController
public class RestExample {
	
	@Autowired
	BlogService blogService;
	
	@RequestMapping("/getAllBlog")
	@GetMapping
	public List<Blog> getAllBlog() {
		return blogService.findAllBlog();
	}
	
	@RequestMapping("/getBlog/id")
	@GetMapping
	public Blog getBlog(@PathVariable("id") String id) {
		return blogService.findById(id);
	}
	
	@RequestMapping("/saveBlog")
	@PostMapping
	public void addBlog(Blog blog) {
		blogService.save();
	}
	
	@RequestMapping("/updateBlog/id")
	@PutMapping
	public Blog updateBlog(@PathVariable("id") String id) {
		return blogService.save();
	}
	
	@RequestMapping("/deleteBlog/id")
	@DeleteMapping
	public void deleteBlog(@PathVariable("id") String id) {
		return blogService.delete();
	}

}
