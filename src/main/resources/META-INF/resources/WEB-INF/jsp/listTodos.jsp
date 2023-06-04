
  <%@ include file="common/header.jspf"%>
  <%@ include file="common/navigation.jspf" %>
  
   <div class="container">
   <h2>Welcome ${name}</h2>
   <hr>
    <h1>Your Todos are </h1>
    	<table class="table">
    		<thead>
    			<tr>
    				<th>Descripton</th>
    				<th>Target Date</th>
    				<th>Is Done?</th>
    				<th></th>
    				<th></th>
    			</tr>
    		</thead>
    		
    		<tbody>
    			<c:forEach items="${todos}" var="todo">
    				<tr>
    					<td>${todo.description}</td>
    					<td>${todo.localDate}</td>
    					<td>${todo.done}</td>
    					<td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
    					<td><a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
    				</tr>	
    			</c:forEach>
    		</tbody>
    	</table>
    	
    	<a href="addTodo" class="btn btn-success">ADD TODO</a>
   </div>
    	
    	<%@ include file="common/footer.jspf"%>F
