<jsp:useBean class="model.Student"  id="s" />
<%@page  import="dao.StudentDau" %>
<jsp:setProperty  name="s" property="*" />

<% 
int result=StudentDau.saveStudent(s);

if(result>0){
    response.sendRedirect("sucess.jsp");
    
    }
    else{
    
    response.sendRedirect("error.jsp");
    
    }


%>