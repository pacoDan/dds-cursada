Usuario usuario =  new Usuario();
//hidratar usuario
Direccion direccionActual = new Direccion();
//hidratar direccion
usuario.irADestino(new Destino(direccionActual));
usuario.VerCuidadores()
Cuidador cuidador = new Cuidador();
List cuidadores = new ArrayList<Cuidador>();
//hidratar cuidador
usuario.ConfirmarCuidador(cuidador);// hay mas cuidadores
// o 
usuario.ConfirmarCuidadores(cuidadores);// <-----
// notificar transeuntes, para que acepten o rechazen el cuidado


// cuidadores siendo informados
transeunte.Comenzar(); // notifica tiempo de demora a cuidadores 
//segun ubicacion mediante API REST

// comportamiento de que si  esta en movimiento no notificar

// cuando el transeunte llega a Destino
transeunte.LlegueBien(); // habilita notificaciones
//notificar a cuidadores su estado (de esta bien)


  // como se da cuenta si algo malo sucede?
transeunte.EnviarAlertaACuidadores();
transeunte.realizarLlamadaAPolicia();
transeunte.llamarAlCelularDelUsuario();
transeunte.EsperarSiEsFalsaAlarma(self.N);

