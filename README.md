Documentation
Ce projet vous montre comment connecter des projets ejb ear et web.

Configuration du projet
On crée les projets et ensuite on ajoute ejb et web dans le deployment assembly de ear et on ajoute aussi ejb en tant que dependance dans web.
Dans ejb on crée une interface et son implementation.


Dans Web on fait appel à l'interface comme si :

Dans le controller:

	@EJB
	private IHello hellometier;
  
  
  et dans la methode qui va utliser les données de l'interface dans doGet pour nous :
  
  response.getWriter().print(hellometier.message());
