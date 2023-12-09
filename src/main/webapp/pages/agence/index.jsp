<%--
  Created by IntelliJ IDEA.
  User: esprit_critique
  Date: 08/12/2023
  Time: 03:49
  To change this template use File | Settings | File Templates.
--%>

<%@include file="../../header/_header.jsp"%>
<h2>Liste Agences </h2>

<c:choose>
    <c:when test="${!empty agences}">
        <table class="table table-strepid">
            <tr class="table-dark">
                <th>Nom</th>
                <th>Tel</th>
                <th>Email</th>
                <th>Adresse</th>
                <th>Cp</th>
                <th>Ville</th>
                <th>Image</th>
                <th>Action</th>
            </tr>

            <c:forEach items="${agences}" var="agence">
                <tr>
                    <td> <c:out value="${agence.getNom()}"/> </td>
                    <td> <c:out value="${agence.getTel()}"/> </td>
                    <td> <c:out value="${agence.getEmail()}"/> </td>
                    <td> <c:out value="${agence.getAdresse()}"/> </td>
                    <td> <c:out value="${agence.getCp()}"/> </td>
                    <td> <c:out value="${agence.getVille()}"/> </td>
                    <td>
                        <img src="./img/${agence.getImage()}" alt="logo" class="img-fluid w-25 imgHover"/>
                    </td>

                    <td>
                        <a href="${pageContext.request.contextPath}/agences/edit?id=${agence.getId_agence()}">modifier</a>
                        <a href="${pageContext.request.contextPath}/agences/delete?id=${agence.getId_agence()}" class="delete">
                            supprimer
                        </a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </c:when>
    <c:otherwise>
        Liste d'agence  vide
    </c:otherwise>
</c:choose>
</body>
</html>
