<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

private String type;
private double amount;
private String purpose;
private String risk;
private String nominee;
private int term;
<h1> Add Investment</h1>
<form action ="addInvestment" method="post">
Name <input type="text" name="planName"><br>
Entry Age <input type="text" name="entryAge"><br>
Amount <input type="text" name="amount"><br>
Term <input type="text" name="term"><br>
Risk <input type="radio" name="risk" value="low"> Low 
     <input type="radio" name="risk" value="high"> High 
  <br>
Purpose<select name="purpose">
        <option value="EDUCATION">Education
         <option value="MARRIAGE">Marriage
          <option value="RETIREMENT">Retirement
       </select><br>
       
Nominee <select name="nominee">
         <option value="FATHER">Father
          <option value="MOTHER">Mother
           <option value="HUSBAND">Husband
            <option value="WIFE">Wife
            <option value="SON">Son  
             <option value="DAUGHTER">Daughter
             </select><br>
             
 Type<select name="type">
             <option value="Mutual Fund">Mutual Fund
              <option value="Public Provident Fund">PPF
               <option value="Unit Limited Investment Fund">ULIP
                <option value="Senior Pension Scheme">Senior Scheme
                 <option value="Fixed Deposite">FD
      </select>            
             
                
<input type ="submit" value="Add Investment">



</form>

</body>
</html>