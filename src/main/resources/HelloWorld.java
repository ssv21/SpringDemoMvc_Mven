import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;


public class HelloWorld implements controller {
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletRequest res) throws Exception{
		
		String nam =req.getParameter("name");
		
		Map  map =new HashMap();
		
		m.put("output", "hi --------->"+nam);
		
		ModelAndView  mov = new ModelAndView("success",map);
		
		return mov;
		
	} 
}
