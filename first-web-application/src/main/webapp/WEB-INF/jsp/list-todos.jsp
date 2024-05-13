<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@ include file="common/footer.jspf"%>
	<style>

		#s1{
           color: red;
		   text-align: center;
		   background-color: skyblue;
		   font-size: 45px;
		  
		}
		.button{
			font-weight: 800;
			font-size: 20px;

		}
		
	</style>
	<div class="container" >
		
		<table class="table table-striped">
			<caption><h1 id="s1"><i>Your Check_List</i></h1> </caption>
			<thead>
				<tr>
					<th style="background-color: rgb(3, 223, 58);color: rgb(219, 22, 22);padding: 11px 24px;width: 50px;border-radius: 30px;margin-left: 150px;"> Studet_Name</th>
					<th style="background-color: rgb(3, 223, 58);color: rgb(196, 9, 9);padding: 11px 24px;width: 100px;border-radius: 30px">Roll_Number</th>
					<th style="background-color: rgb(3, 223, 58);color: rgb(196, 28, 28);padding: 11px 24px;width: 100px;border-radius: 30px">Phone_Number</th>
					<th style="background-color: rgb(3, 223, 58);color: rgb(233, 29, 29);padding: 11px 24px;width: 100px;border-radius: 30px">Checking_Date</th>
					
					<th style="background-color: rgb(10, 25, 236);color: black;padding: 11px 24px;width: 80px;border-radius: 30px">Edit</th>
					<th style="background-color: rgb(235, 74, 26);color: black;padding: 11px 24px;width: 70px;border-radius: 30px">Remove</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td style="color: rgb(0, 0, 0); font-weight: 1000;">${todo.studentName}</td>
						<td style="color: rgb(0, 0, 0); font-weight: 1000;">${todo.rollNumber}</td>
						<td style="color: rgb(0, 0, 0); font-weight: 1000;">${todo.phno}</td>
						<td style="color: rgb(0, 0, 0); font-weight: 1000;"><fmt:formatDate value="${todo.checkingDate}" pattern="dd/MM/yyyy"/></td>
					 	
						 <td><a type="button" class="btn btn-success"
							href="/update-todo?sno=${todo.sno}">Edit</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-todo?sno=${todo.sno}">Remove</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button"  style="background-color: rgb(56, 19, 143);color: rgb(248, 126, 126);padding: 10px 20px ;border-radius: 40px; " ; color="black" href="/add-todo">Add Student</a>
		</div> 
	</div>
	
	<%@ include file="common/footer.jspf"%>