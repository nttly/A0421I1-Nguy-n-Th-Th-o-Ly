<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/12/2021
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Simple Calculator</h2>
  <form action="/tinh" method="post">
    <h4> Calculator</h4>
    <table>
      <tr>
          <td>First:</td>
          <td>
          <input type="text" name="first" value="${first}">
          </td>
      </tr>
     <tr>
       <td>
          Operator :
       </td>
       <td>
         <select name="ope">
           <option >+</option>
           <option >-</option>
           <option >*</option>
           <option >/</option>
         </select>
       </td>
     </tr>
      <tr>
          <td>Second:</td>
        <td>
          <input type="text" name="second" value="${second}">
        </td>
      </tr>
      <tr>
          <td></td>
        <td>
          <input type="submit" value="Calculate">
        </td>
      </tr>
      <tr>
        <td>
          Result :
        </td>
          <td>
          <input type="text" value="${r}">
        </td>
      </tr>

    </table>

  </form>
  </body>
</html>
