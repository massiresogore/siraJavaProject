<%--
  Created by IntelliJ IDEA.
  User: esprit_critique
  Date: 08/12/2023
  Time: 04:16
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../../header/_header.jsp"%>
<h2> New Form </h2>

<form method="post" action="">
    <div>
        <label for="id_agence">id_agence</label>
        <input type="text" name="id_agence" id="id_agence" placeholder="id_agence" >
    </div>
    <div>
        <label for="nom">nom</label>
        <input type="text" name="nom" id="nom" placeholder="nom" >
    </div>
    <div>
        <label for="tel">tel</label>
        <input type="text" name="tel" id="tel" placeholder="tel" >
    </div>
    <div>
        <label for="email">email</label>
        <input type="text" name="email" id="email" placeholder="email" >
    </div>
    <div>
        <label for="adresse">adresse</label>
        <input type="text" name="adresse" id="adresse" placeholder="adresse" >
    </div>
    <div>
        <label for="cp">cp</label>
        <input type="text" name="cp" id="cp" placeholder="cp" >
    </div>
    <div>
        <label for="ville">ville</label>
        <input type="text" name="ville" id="ville" placeholder="ville" >
    </div>
    <div>
        <label for="image">image</label>
        <input type="file" name="" id="image" placeholder="image" >
    </div>
    <input type="submit" value="${ agence ? "Modifier" : "Enregistrer"}">
</form>

</body>
</html>
