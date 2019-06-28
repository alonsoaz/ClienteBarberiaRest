package com.barberia.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.barberia.response.*;
import com.barberia.response.MessagenID;
import com.barberia.entity.LoginUsuario;
import com.fasterxml.jackson.databind.ObjectMapper;

public class model {

	RestTemplate restTemplate = new RestTemplate();
	MessagenID mid;
	MessagenID[] jsonObj;
	MessagenID[][] jjsonObj;
	MensajesBeans mbn;
	MensajesBeans[] mbnjsonObj;
	MensajesBeans[][] mbnjjsonObj;
	Aidi aid;
	List<Aidi> aidi = new ArrayList<Aidi>();
	Aidi[] aidjsonObj;
	Aidi[][] aidjjsonObj;
	
	
	

	private static model stdregd = null;

	public static model getInstance() {

		if (stdregd == null) {
			stdregd = new model();
			return stdregd;
		} else {
			return stdregd;
		}
	}

	ObjectMapper mapper = new ObjectMapper();

	public MessagenID iniciarsesion(String us, String pw) {
		String postUrl = "http://660aa324.ngrok.io/barberia/usuario/login";
		LoginUsuario usuario = new LoginUsuario(us, pw);
		ResponseEntity<String> postResponse = restTemplate.postForEntity(
				postUrl, usuario, String.class);

		try {
			jsonObj = mapper.readValue(postResponse.getBody(), MessagenID[].class);
			for (MessagenID itr : jsonObj)
				mid = new MessagenID(itr.getMessage(), itr.getId());
			return mid;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mid;
	}

	public List<RecuperarTipoUsuario> tipousuario() {
		
		RecuperarTipoUsuario rt;
		List<RecuperarTipoUsuario> rtu;
		RecuperarTipoUsuario[] rtujsonObj;
		RecuperarTipoUsuario[][] rtujjsonObj;
		
		rtu = new ArrayList<RecuperarTipoUsuario>();
		String postUrl = "http://660aa324.ngrok.io/barberia/usuario/tipo";

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), 
					RecuperarTipoUsuario[].class);
			for (RecuperarTipoUsuario itr : rtujsonObj) {
				rt = new RecuperarTipoUsuario(itr.getMessage(), itr.getId());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}

	public MessagenID regUzer(
			int id, 
			String nombre, 
			String apellido, 
			String aka, 
			String pass, 
			String mail, 
			String tlf,
			String desc) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/usuario/register/login";
		InsertarUsuario usuario = new InsertarUsuario(id + "", nombre, apellido, "", aka, pass, mail, tlf, desc);
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, usuario, String.class);

		try {
			jsonObj = mapper.readValue(postResponse.getBody(), MessagenID[].class);
			for (MessagenID itr : jsonObj)
				mid = new MessagenID(itr.getMessage(), itr.getId());
			return mid;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mid;
	}
	
	public MessagenID chngPass(int id, String oldpass, String newpass) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/usuario/{id}/changepass";
		CambiarClave cng = new CambiarClave(oldpass, newpass);
	    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
	    uriVariables.put("id",id);
	    HttpEntity<CambiarClave> requestEntity = new HttpEntity<CambiarClave>(cng);
		ResponseEntity<String> postResponse = restTemplate.exchange(
				postUrl, 
				HttpMethod.PUT, 
				requestEntity, 
				String.class, 
				uriVariables);

		try {
			jsonObj = mapper.readValue(postResponse.getBody(), MessagenID[].class);
			for (MessagenID itr : jsonObj)
				mid = new MessagenID(itr.getMessage(), itr.getId());
			return mid;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mid;
	}
	
	public List<ListarUsuarios> allUzrs() {
		
		ListarUsuarios rt;
		List<ListarUsuarios> rtu;
		ListarUsuarios[] rtujsonObj;
		ListarUsuarios[][] rtujjsonObj;
		
		rtu = new ArrayList<ListarUsuarios>();
		String postUrl = "http://660aa324.ngrok.io/barberia/usuario/allusuarios";

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), ListarUsuarios[].class);
			for (ListarUsuarios itr : rtujsonObj) {
				rt = new ListarUsuarios(
						itr.getAidUsuario(),
						itr.getBCod(),
						itr.getCnombre(),
						itr.getDargo(),
						itr.getEaka(),
						itr.getFmail(),
						itr.getGcelular(),
						itr.getHDescripcion());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public List<BuscarUsuario> uzrbyword(String word) {
		
		BuscarUsuario rt;
		List<BuscarUsuario> rtu;
		BuscarUsuario[] rtujsonObj;
		BuscarUsuario[][] rtujjsonObj;
		
		rtu = new ArrayList<BuscarUsuario>();
		String postUrl = "http://660aa324.ngrok.io/barberia/usuario/allusuarios?words="+word;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), BuscarUsuario[].class);
			for (BuscarUsuario itr : rtujsonObj) {
				rt = new BuscarUsuario(
						itr.getAidUsuario(),
						itr.getBCod(),
						itr.getCnombre(),
						itr.getDargo(),
						itr.getEaka(),
						itr.getFmail(),
						itr.getGcelular(),
						itr.getHDescripcion(),
						itr.getIdUnico());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public List<RecuperarUsuario> getUzr(int id) {
		
		RecuperarUsuario rt;
		List<RecuperarUsuario> rtu;
		RecuperarUsuario[] rtujsonObj;
		RecuperarUsuario[][] rtujjsonObj;
		
		rtu = new ArrayList<RecuperarUsuario>();
		String postUrl = "http://660aa324.ngrok.io/barberia/usuario/get/"+id;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), RecuperarUsuario[].class);
			for (RecuperarUsuario itr : rtujsonObj) {
				rt = new RecuperarUsuario(
						itr.getAnombre(),
						itr.getCapellido(),
						itr.getDcargo(),
						itr.getEaka(),
						itr.getFcorreo(),
						itr.getGtelefono(),
						itr.getHdescripcion());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public MessagenID updtUzr(
		int id, 
		String nombre, 
		String apellido, 
		String aka,  
		String mail, 
		String tlf,
		String descripcion		
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/usuario/update/{id}";
		RecuperarUsuario cng = new RecuperarUsuario(
				nombre,
				apellido,
				"",
				aka,
				mail,
				tlf,
				descripcion);
	    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
	    uriVariables.put("id",id);
	    HttpEntity<RecuperarUsuario> requestEntity = new HttpEntity<RecuperarUsuario>(cng);
		ResponseEntity<String> postResponse = restTemplate.exchange(
				postUrl, 
				HttpMethod.PUT, 
				requestEntity, 
				String.class, 
				uriVariables);

		try {
			jsonObj = mapper.readValue(postResponse.getBody(), MessagenID[].class);
			for (MessagenID itr : jsonObj)
				mid = new MessagenID(itr.getMessage(), itr.getId());
			return mid;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mid;
	}
	
	public List<ListarClienteInterno> allClients() {
		
		ListarClienteInterno rt;
		List<ListarClienteInterno> rtu;
		ListarClienteInterno[] rtujsonObj;
		ListarClienteInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<ListarClienteInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/cliente/allclientes";

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), ListarClienteInterno[].class);
			for (ListarClienteInterno itr : rtujsonObj) {
				rt = new ListarClienteInterno(
						itr.getAidCliente(),
						itr.getBCodigo(),
						itr.getCompleto(),
						itr.getDni(),
						itr.getEstado(),
						itr.getGCelular(),
						itr.getHEmail(),
						itr.getJDireccion(),
						itr.getKModifiedBy(),
						itr.getLdate());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public List<BuscarClienteInterno> cltbyword(String word) {
		
		BuscarClienteInterno rt;
		List<BuscarClienteInterno> rtu;
		BuscarClienteInterno[] rtujsonObj;
		BuscarClienteInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<BuscarClienteInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/cliente/allclientes?words="+word;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), BuscarClienteInterno[].class);
			for (BuscarClienteInterno itr : rtujsonObj) {
				rt = new BuscarClienteInterno(
						itr.getAiDCliente(),
						itr.getBCod(),
						itr.getCCompleto(),
						itr.getDni(),
						itr.getFEsatado(),
						itr.getGCelular(),
						itr.getHEmail(),
						itr.getJDireccion(),
						itr.getKModifiedBy(),
						itr.getLdate(),
						itr.getMIdUnico());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public List<RecuperarClienteInterno> getClt(int idClient) {
		
		RecuperarClienteInterno rt;
		List<RecuperarClienteInterno> rtu;
		RecuperarClienteInterno[] rtujsonObj;
		RecuperarClienteInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<RecuperarClienteInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/cliente/get/"+idClient;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), RecuperarClienteInterno[].class);
			for (RecuperarClienteInterno itr : rtujsonObj) {
				rt = new RecuperarClienteInterno(
						itr.getBnombre(),
						itr.getCapellido(),
						itr.getDtelefono(),
						itr.getEDni(),
						itr.getFcorreo(),
						itr.getGdireccion(),
						itr.getIdEstado());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public MensajesBeans regClt(
			int idUser, 
			String nombre, 
			String apellido, 
			String telefono, 
			String dni, 
			String mail, 
			String direccion,
			String password
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/cliente/"+idUser+"/register";
		InsertarCliente cliente = new InsertarCliente
				(nombre,
				apellido, 
				telefono, 
				dni, 
				mail,
				direccion,
				password);
		
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, cliente, String.class);

		try {
			mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
			for (MensajesBeans itr : mbnjsonObj)
				mbn = new MensajesBeans(itr.getMensaje());
			return mbn;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mbn;
	}
	
	public Aidi regCltLogin(
			int idUser, 
			String nombre, 
			String apellido, 
			String telefono, 
			String dni, 
			String mail, 
			String direccion,
			String password 
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/cliente/"+idUser+"/register/login";
		InsertarCliente cliente = new InsertarCliente
				(nombre,
				apellido, 
				telefono, 
				dni, 
				mail,
				direccion,
				password);
		
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, cliente, String.class);

		try {
			aidjsonObj = mapper.readValue(postResponse.getBody(), Aidi[].class);
			for (Aidi itr : aidjsonObj)
				aid = new Aidi(itr.getAidi());
			return aid;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return aid;
	}	
	
	public MessagenID cltLogin( 
			String dni, 
			String telefono
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/android/login";
		LoginCliente cliente = new LoginCliente
				(dni, telefono);
		
		ResponseEntity<String> postResponse = restTemplate.postForEntity(
				postUrl, cliente, String.class);

		try {
			jsonObj = mapper.readValue(postResponse.getBody(), MessagenID[].class);
			for (MessagenID itr : jsonObj)
				mid = new MessagenID(itr.getMessage(), itr.getId());
			return mid;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mid;
	}	

	public MensajesBeans updtClt(
			int idUser,
			int id,
			String nombre,
			String apellido,
			String telefono,
			String dni,
			String correo,
			String direccion,
			int estado) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/cliente/{idUser}/update/{id}";
			RecuperarClienteInterno cng = new RecuperarClienteInterno(
					nombre, 
					apellido, 
					telefono, 
					dni,
					correo, 
					direccion, 
					estado);
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarClienteInterno> requestEntity = new HttpEntity<RecuperarClienteInterno>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.PUT, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	
	public MensajesBeans delClt(
			int idUser,
			int id) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/cliente/{idUser}/delete/{id}";
			RecuperarClienteInterno cng = new RecuperarClienteInterno();
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarClienteInterno> requestEntity = new HttpEntity<RecuperarClienteInterno>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.PUT, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	public List<ListarBarberoInterno> allBarbs() {
		
		ListarBarberoInterno rt;
		List<ListarBarberoInterno> rtu;
		ListarBarberoInterno[] rtujsonObj;
		ListarBarberoInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<ListarBarberoInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/barbero/allbarberos";

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), ListarBarberoInterno[].class);
			for (ListarBarberoInterno itr : rtujsonObj) {
				rt = new ListarBarberoInterno(
						itr.getAidBarbero(),
						itr.getBcod(),
						itr.getECompleto(),
						itr.getFEstado(),
						itr.getHcelular(),
						itr.getIDni(),
						itr.getJEmail(),
						itr.getKDireccion(),
						itr.getLModifiedBy(),
						itr.getMdate());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}

	public List<BuscarBarberoInterno> barbbyword(String word) {
		
		BuscarBarberoInterno rt;
		List<BuscarBarberoInterno> rtu;
		BuscarBarberoInterno[] rtujsonObj;
		BuscarBarberoInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<BuscarBarberoInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/barbero/allbarberos?words="+word;
	
		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);
	
		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), BuscarBarberoInterno[].class);
			for (BuscarBarberoInterno itr : rtujsonObj) {
				rt = new BuscarBarberoInterno(
						itr.getAidBarbero(),
						itr.getBcod(),
						itr.getECompleto(),
						itr.getFEstado(),
						itr.getHcelular(),
						itr.getIDni(),
						itr.getJEmail(),
						itr.getKDireccion(),
						itr.getLModifiedBy(),
						itr.getMdate(),
						itr.getLIdUnico());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public List<RecuperarBarbero> getBarb(int idBarbero) {
		
		RecuperarBarbero rt;
		List<RecuperarBarbero> rtu;
		RecuperarBarbero[] rtujsonObj;
		RecuperarBarbero[][] rtujjsonObj;
		
		rtu = new ArrayList<RecuperarBarbero>();
		String postUrl = "http://660aa324.ngrok.io/barberia/barbero/get/"+idBarbero;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), RecuperarBarbero[].class);
			for (RecuperarBarbero itr : rtujsonObj) {
				rt = new RecuperarBarbero(
						itr.getAidEstado(),
						itr.getBNombre(),
						itr.getCApellido(),
						itr.getDTelefono(),
						itr.getEDni(),
						itr.getFEmail(),
						itr.getGDireccion());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public MensajesBeans regBarb(
			int idUser, 
			String nombre, 
			String apellido, 
			String telefono, 
			String dni, 
			String mail, 
			String direccion
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/barbero/"+idUser+"/register";
		InsertarBarbero barbero = new InsertarBarbero
				(nombre,
				apellido, 
				telefono, 
				dni, 
				mail,
				direccion);
		
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, barbero, String.class);

		try {
			mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
			for (MensajesBeans itr : mbnjsonObj)
				mbn = new MensajesBeans(itr.getMensaje());
			return mbn;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mbn;
	}
	
	public MensajesBeans updtBarb(
			int idUser,
			int id,
			int estado,
			String nombre,
			String apellido,
			String telefono,
			String dni,
			String correo,
			String direccion) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/barbero/{idUser}/update/{id}";
			RecuperarBarbero cng = new RecuperarBarbero(
					estado, 
					nombre, 
					apellido, 
					telefono, 
					dni, 
					correo, 
					direccion)
					;
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarBarbero> requestEntity = new HttpEntity<RecuperarBarbero>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.PUT, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	public MensajesBeans delBarb(
			int idUser,
			int id) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/barbero/{idUser}/delete/{id}";
			RecuperarBarbero cng = new RecuperarBarbero()
					;
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarBarbero> requestEntity = new HttpEntity<RecuperarBarbero>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.PUT, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	public List<ListarServicioInterno> allServ() {
		
		ListarServicioInterno rt;
		List<ListarServicioInterno> rtu;
		ListarServicioInterno[] rtujsonObj;
		ListarServicioInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<ListarServicioInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/servicio/allservicios";

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), ListarServicioInterno[].class);
			for (ListarServicioInterno itr : rtujsonObj) {
				rt = new ListarServicioInterno(
						itr.getAidServicio(),
						itr.getBCod(),
						itr.getCNombre(),
						itr.getEEstado(),
						itr.getFDuracion(),
						itr.getGPrecio(),
						itr.getHDescripcion(),
						itr.getJUser(),
						itr.getKDate());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}

	public List<BuscarServicioInterno> servbyword(String word) {
		
		BuscarServicioInterno rt;
		List<BuscarServicioInterno> rtu;
		BuscarServicioInterno[] rtujsonObj;
		BuscarServicioInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<BuscarServicioInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/servicio/allservicios?words="+word;
	
		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);
	
		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), BuscarServicioInterno[].class);
			for (BuscarServicioInterno itr : rtujsonObj) {
				rt = new BuscarServicioInterno(
						itr.getAidServicio(),
						itr.getBCod(),
						itr.getCNombre(),
						itr.getEEstado(),
						itr.getFDuracion(),
						itr.getGPrecio(),
						itr.getHDescripcion(),
						itr.getJUser(),
						itr.getKDate(),
						itr.getLidUnico());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public List<RecuperarServicio> getServ(int idServicio) {
		
		RecuperarServicio rt;
		List<RecuperarServicio> rtu;
		RecuperarServicio[] rtujsonObj;
		RecuperarServicio[][] rtujjsonObj;
		
		rtu = new ArrayList<RecuperarServicio>();
		String postUrl = "http://660aa324.ngrok.io/barberia/servicio/get/"+idServicio;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), RecuperarServicio[].class);
			for (RecuperarServicio itr : rtujsonObj) {
				rt = new RecuperarServicio(
						itr.getBnombser(),
						itr.getCidEstado(),
						itr.getDminutos(),
						itr.getEprecio(),
						itr.getFdescripcion());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public MensajesBeans regServ(
			int idUser, 
			String nombre, 
			int duracion, 
			double precio, 
			String descripcion
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/servicio/"+idUser+"/register";
		InsertarServicio servicio = new InsertarServicio
				(nombre, 1, duracion, precio, descripcion);
		
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, servicio, String.class);

		try {
			mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
			for (MensajesBeans itr : mbnjsonObj)
				mbn = new MensajesBeans(itr.getMensaje());
			return mbn;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mbn;
	}
	
	public MensajesBeans updtServ(
			int idUser,
			int id,
			int estado,
			String nombre,
			int minutos,
			double precio,
			String descripcion) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/servicio/{idUser}/update/{id}";
			RecuperarServicio cng = new RecuperarServicio(
					nombre, 
					estado, 
					minutos, 
					precio, 
					descripcion)
					;
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarServicio> requestEntity = new HttpEntity<RecuperarServicio>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.PUT, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	public MensajesBeans delServ(
			int idUser,
			int id) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/servicio/{idUser}/delete/{id}";
			RecuperarServicio cng = new RecuperarServicio()
					;
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarServicio> requestEntity = new HttpEntity<RecuperarServicio>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.DELETE, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
	}

	public List<ListarMarca> allMark() {
		
		ListarMarca rt;
		List<ListarMarca> rtu;
		ListarMarca[] rtujsonObj;
		ListarMarca[][] rtujjsonObj;
		
		rtu = new ArrayList<ListarMarca>();
		String postUrl = "http://660aa324.ngrok.io/barberia/marca/allmarcas";

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), ListarMarca[].class);
			for (ListarMarca itr : rtujsonObj) {
				rt = new ListarMarca(
						itr.getAIdMarca(),
						itr.getBCod(),
						itr.getCMarca(),
						itr.getDEstado());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}

	public List<RecuperarMarca> getMark(int idMarca) {
		
		RecuperarMarca rt;
		List<RecuperarMarca> rtu;
		RecuperarMarca[] rtujsonObj;
		RecuperarMarca[][] rtujjsonObj;
		
		rtu = new ArrayList<RecuperarMarca>();
		String postUrl = "http://660aa324.ngrok.io/barberia/marca/get/"+idMarca;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), RecuperarMarca[].class);
			for (RecuperarMarca itr : rtujsonObj) {
				rt = new RecuperarMarca(
						itr.getCmarca(),
						itr.getDidEstado()
						);
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public MensajesBeans regMark(
			int idUser, 
			String marca
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/marca/"+idUser+"/register";
		InsertarMarca servicio = new InsertarMarca(marca);
		
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, servicio, String.class);
		String HS = ("["+postResponse.getBody()+"]");

		try {
			mbnjsonObj = mapper.readValue(HS, MensajesBeans[].class);
			for (MensajesBeans itr : mbnjsonObj)
				mbn = new MensajesBeans(itr.getMensaje());
			return mbn;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mbn;
	}
	
	public MensajesBeans updtMark(
			int idUser,
			int id,
			String marca,
			int estado) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/marca/{idUser}/update/{id}";
			RecuperarMarca cng = new RecuperarMarca(
					marca, 
					estado)
					;
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarMarca> requestEntity = new HttpEntity<RecuperarMarca>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.PUT, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	public MensajesBeans delMark(
			int idUser,
			int id) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/marca/{idUser}/delete/{id}";
			RecuperarMarca cng = new RecuperarMarca()
					;
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarMarca> requestEntity = new HttpEntity<RecuperarMarca>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.DELETE, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
public List<ListarTipo> allTipo() {
		
	ListarTipo rt;
		List<ListarTipo> rtu;
		ListarTipo[] rtujsonObj;
		ListarTipo[][] rtujjsonObj;
		
		rtu = new ArrayList<ListarTipo>();
		String postUrl = "http://660aa324.ngrok.io/barberia/tipo/alltipos";

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), ListarTipo[].class);
			for (ListarTipo itr : rtujsonObj) {
				rt = new ListarTipo(
						itr.getAidTipoProducto(),
						itr.getCtipo(),
						itr.getDEstado());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}

	public List<RecuperarTipo> getTipo(int idTipo) {
		
		RecuperarTipo rt;
		List<RecuperarTipo> rtu;
		RecuperarTipo[] rtujsonObj;
		RecuperarTipo[][] rtujjsonObj;
		
		rtu = new ArrayList<RecuperarTipo>();
		String postUrl = "http://660aa324.ngrok.io/barberia/tipo/get/"+idTipo;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), RecuperarTipo[].class);
			for (RecuperarTipo itr : rtujsonObj) {
				rt = new RecuperarTipo(
						itr.getBTipo(),
						itr.getCidEstado()
						);
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public MensajesBeans regTipo(
			int idUser, 
			String tipo
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/tipo/"+idUser+"/register";
		InsertarTipo servicio = new InsertarTipo(tipo);
		
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, servicio, String.class);
		String HS = ("["+postResponse.getBody()+"]");

		try {
			mbnjsonObj = mapper.readValue(HS, MensajesBeans[].class);
			for (MensajesBeans itr : mbnjsonObj)
				mbn = new MensajesBeans(itr.getMensaje());
			return mbn;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mbn;
	}
	
	public MensajesBeans updtTipo(
			int idUser,
			int id,
			String tipo,
			int estado) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/tipo/{idUser}/update/{id}";
			RecuperarTipo cng = new RecuperarTipo(
					tipo, 
					estado)
					;
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarTipo> requestEntity = new HttpEntity<RecuperarTipo>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.PUT, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	public MensajesBeans delTipo(
			int idUser,
			int id) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/tipo/{idUser}/delete/{id}";
			RecuperarTipo cng = new RecuperarTipo()
					;
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarTipo> requestEntity = new HttpEntity<RecuperarTipo>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.DELETE, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	public List<ListarProductoInterno> allProd() {
		
		ListarProductoInterno rt;
		List<ListarProductoInterno> rtu;
		ListarProductoInterno[] rtujsonObj;
		ListarProductoInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<ListarProductoInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/producto/allproductos";

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), ListarProductoInterno[].class);
			for (ListarProductoInterno itr : rtujsonObj) {
				rt = new ListarProductoInterno(
						itr.getAidProducto(),
						itr.getBcodigo(),
						itr.getDTipo(),
						itr.getEProd(),
						itr.getGMarca(),
						itr.getIEstado(),
						itr.getJCantidad(), 
						itr.getKPrecio(),
						itr.getLDescripcion(),
						itr.getNUser(),
						itr.getOdate());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}

	public List<BuscarProductoInterno> prodbyword(String word) {
		
		BuscarProductoInterno rt;
		List<BuscarProductoInterno> rtu;
		BuscarProductoInterno[] rtujsonObj;
		BuscarProductoInterno[][] rtujjsonObj;
		
		rtu = new ArrayList<BuscarProductoInterno>();
		String postUrl = "http://660aa324.ngrok.io/barberia/producto/allproductos?words="+word;
	
		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);
	
		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), BuscarProductoInterno[].class);
			for (BuscarProductoInterno itr : rtujsonObj) {
				rt = new BuscarProductoInterno(
						itr.getAidProducto(),
						itr.getBcodigo(),
						itr.getDTipo(),
						itr.getEProd(),
						itr.getGMarca(),
						itr.getIEstado(),
						itr.getJCantidad(), 
						itr.getKPrecio(),
						itr.getLDescripcion(),
						itr.getNUser(),
						itr.getOdate(),
						itr.getPIdUnik());
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public List<RecuperarProducto> getProd(int idProducto) {
		
		RecuperarProducto rt;
		List<RecuperarProducto> rtu;
		RecuperarProducto[] rtujsonObj;
		RecuperarProducto[][] rtujjsonObj;
		
		rtu = new ArrayList<RecuperarProducto>();
		String postUrl = "http://660aa324.ngrok.io/barberia/producto/get/"+idProducto;

		ResponseEntity<String> getResponse = restTemplate.getForEntity(postUrl, String.class);

		try {
			rtujsonObj = mapper.readValue(getResponse.getBody(), RecuperarProducto[].class);
			for (RecuperarProducto itr : rtujsonObj) {
				rt = new RecuperarProducto(
						itr.getAIdMarca(),
						itr.getBidTipo(),
						itr.getCNombre(),
						itr.getDidEstado(),
						itr.getFStock(),
						itr.getGPrecio(),
						itr.getHdescripcion()
						);
				rtu.add(rt);
			}
			return rtu;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return rtu;
	}
	
	public MensajesBeans regProd(
			int idUser,
			int idMarca,
			int idTipo,
			String nombre, 
			int stock, 
			double precio, 
			String descripcion
			) {
		
		String postUrl = "http://660aa324.ngrok.io/barberia/producto/"+idUser+"/register";
		InsertarProducto producto = new InsertarProducto
				(idMarca,
				idTipo,
				nombre,
				stock, 
				precio, 
				descripcion);
		
		ResponseEntity<String> postResponse = restTemplate.postForEntity(postUrl, producto, String.class);

		try {
			mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
			for (MensajesBeans itr : mbnjsonObj)
				mbn = new MensajesBeans(itr.getMensaje());
			return mbn;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return mbn;
	}
	
	public MensajesBeans updtProd(
			int idUser,
			int id,
			int idMarca,
			int idTipo,
			int estado,
			String nombre,
			int stock,
			double precio,
			String descripcion) {
			
			String postUrl = "http://660aa324.ngrok.io/barberia/producto/{idUser}/update/{id}";
			RecuperarProducto cng = new RecuperarProducto
					(idMarca, idTipo, nombre, estado, stock, precio, descripcion);
			
		    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		    uriVariables.put("idUser",idUser);
		    uriVariables.put("id",id);
		    HttpEntity<RecuperarProducto> requestEntity = new HttpEntity<RecuperarProducto>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.PUT, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
		}
	
	public MensajesBeans delProd(
			int idUser,
			int id) {
			
		String postUrl = "http://660aa324.ngrok.io/barberia/producto/{idUser}/delete/{id}";
		RecuperarProducto cng = new RecuperarProducto
				();
		
	    Map<String, Integer> uriVariables = new HashMap<String, Integer>();
	    uriVariables.put("idUser",idUser);
	    uriVariables.put("id",id);
	    HttpEntity<RecuperarProducto> requestEntity = new HttpEntity<RecuperarProducto>(cng);
			ResponseEntity<String> postResponse = restTemplate.exchange(
					postUrl, 
					HttpMethod.DELETE, 
					requestEntity, 
					String.class, 
					uriVariables);

			try {
				mbnjsonObj = mapper.readValue(postResponse.getBody(), MensajesBeans[].class);
				for (MensajesBeans itr : mbnjsonObj)
					mbn = new MensajesBeans(itr.getMensaje());
				return mbn;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return mbn;
	}
	
}
