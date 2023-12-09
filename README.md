***** Creation de méthode
static Agence  AgenceRequest(HttpServletRequest request) {
    String nom =  request.getParameter("nom");
    String tel =  request.getParameter("tel");
    String email =  request.getParameter("email");
    String adresse =  request.getParameter("adresse");
    String cp =  request.getParameter("cp");
    String ville =  request.getParameter("ville");
    String image =  request.getParameter("image");
    return  new Agence(nom,tel,email,adresse,cp,ville,image);
}
pour éviter la duplication# siraJavaProject
