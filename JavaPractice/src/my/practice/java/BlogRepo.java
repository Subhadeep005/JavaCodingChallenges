package my.practice.java;

public interface BlogRepo extends JpaRepository{
	
	@Query("")
	public Blog findByBlogTitle();

}
