<%--
  Created by IntelliJ IDEA.
  User: esprit_critique
  Date: 08/12/2023
  Time: 04:16
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../../header/_header.jsp"%>
<h2> Edit Form </h2>
<form method="post" action="${pageContext.request.contextPath}/agences/edit">
    <div>
        <label for="id_agence">id_agence</label>
        <input value="${agence !=null ? agence.getId_agence() : ''}" type="text" name="id_agence" id="id_agence" placeholder="id_agence" >
    </div>
    <div>
        <label for="nom">nom</label>
        <input value="${agence !=null ? agence.getNom() : ''}" type="text" name="nom" id="nom" placeholder="nom" >
    </div>
    <div>
        <label for="tel">tel</label>
        <input value="${agence !=null ? agence.getTel() : ''}" type="text" name="tel" id="tel" placeholder="tel" >
    </div>
    <div>
        <label for="email">email</label>
        <input value="${agence !=null ? agence.getEmail() : ''}" type="text" name="email" id="email" placeholder="email" >
    </div>
    <div>
        <label for="adresse">adresse</label>
        <input value="${agence !=null ? agence.getAdresse() : ''}" type="text" name="adresse" id="adresse" placeholder="adresse" >
    </div>
    <div>
        <label for="cp">cp</label>
        <input value="${agence !=null ? agence.getCp() : ''}" type="text" name="cp" id="cp" placeholder="cp" >
    </div>
    <div>
        <label for="ville">ville</label>
        <input value="${agence !=null ? agence.getVille() : ''}" type="text" name="ville" id="ville" placeholder="ville" >
    </div>
    <div>
        <label for="image">image</label>
        <input value="${agence !=null ? agence.getImage() : ''}" type="file" name="" id="image" placeholder="image" >
    </div>
    <input type="submit" value="${ agence !=null ? "Modifier" : "Enregistrer"}">
</form>
</body>
</html>
