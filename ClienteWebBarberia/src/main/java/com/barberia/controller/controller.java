package com.barberia.controller;

import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.barberia.model.model;
import com.barberia.response.Aidi;
import com.barberia.response.BuscarBarberoInterno;
import com.barberia.response.BuscarClienteInterno;
import com.barberia.response.BuscarProductoInterno;
import com.barberia.response.BuscarServicioInterno;
import com.barberia.response.BuscarUsuario;
import com.barberia.response.ListarBarberoInterno;
import com.barberia.response.ListarClienteInterno;
import com.barberia.response.ListarMarca;
import com.barberia.response.ListarProductoInterno;
import com.barberia.response.ListarServicioInterno;
import com.barberia.response.ListarTipo;
import com.barberia.response.ListarUsuarios;
import com.barberia.response.MensajesBeans;
import com.barberia.response.MessagenID;
import com.barberia.response.RecuperarBarbero;
import com.barberia.response.RecuperarClienteInterno;
import com.barberia.response.RecuperarMarca;
import com.barberia.response.RecuperarProducto;
import com.barberia.response.RecuperarServicio;
import com.barberia.response.RecuperarTipo;
import com.barberia.response.RecuperarTipoUsuario;
import com.barberia.response.RecuperarUsuario;

@Controller
@RequestMapping(path="/barberia/usuario")
public class controller {

	HttpServletResponse response;
	model model;

	@RequestMapping(value = {"/login"})
	public String home(ModelMap modl) {

		return "loginusuario";

	}

	@RequestMapping(value = {"/login"}, method = RequestMethod.POST)
	public String loginUser(
			ModelMap modl, 
			@RequestParam String username, 
			@RequestParam String password,
			HttpServletRequest request,
			HttpSession session
			) throws IOException {
		
		String id = request.getParameter("action");
		
		if (id != null) {
			
			
			MessagenID mesgid = model.getInstance().iniciarsesion(username, password);
			
			if( id.equals("LOG IN") ){

				if (mesgid.getId() > 0) {
					
					modl.put("successMessage", mesgid.getMessage());
					session.setAttribute("idUser", (mesgid.getId()));
					
					return "hello";

				}
				
				modl.put("errorMessage", mesgid.getMessage());
				
			}
			
		}
	
		return "loginusuario";
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getRegUzr(ModelMap modl) {
		
		List<RecuperarTipoUsuario> ltu = model.getInstance().tipousuario();

		modl.put("listatu", ltu);

		return "registrarusuario";
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String regUzer(ModelMap modl,
			@RequestParam int ltu, 
			@RequestParam String nombre, 
			@RequestParam String apellidos, 
			@RequestParam String aka, 
			@RequestParam String psw, 
			@RequestParam String email, 
			@RequestParam String telefono,
			@RequestParam String descripcion,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		MessagenID mesgid = model.getInstance().regUzer(ltu, nombre, apellidos, aka, psw, email, telefono, descripcion);
		
		
		if (mesgid.getId() > 0) {
			
			modl.put("successMessage", mesgid.getMessage());
			session.setAttribute("idUser", (mesgid.getId()));
			
			
		}
		
		return "hello";
		
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updUzer(ModelMap modl,
			@RequestParam int idu, 
			@RequestParam String nombre, 
			@RequestParam String apellidos, 
			@RequestParam String aka,
			@RequestParam String email, 
			@RequestParam String telefono,
			@RequestParam String descripcion,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		MessagenID mesgid = model.getInstance().updtUzr
				(idu, nombre, apellidos, aka, email, telefono, descripcion);
		
		
		if (mesgid.getId() > 0) {
			
			modl.put("successMessage", mesgid.getMessage());
			session.setAttribute("idUser", (mesgid.getId()));
			
		}
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/registerpro", method = RequestMethod.POST)
	public String regProd(ModelMap modl,
			@RequestParam int lmk, 
			@RequestParam int ltp, 
			@RequestParam String producto, 
			@RequestParam int stock, 
			@RequestParam double precio, 
			@RequestParam String descripcion,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().regProd(idUser, lmk, ltp, producto, stock, precio, descripcion);
			
			modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "/updatepro", method = RequestMethod.POST)
	public String updProd(ModelMap modl,
			@RequestParam int idp,
			@RequestParam int lmk, 
			@RequestParam int ltp,
			@RequestParam int estado,
			@RequestParam String producto, 
			@RequestParam int stock, 
			@RequestParam double precio, 
			@RequestParam String descripcion,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().updtProd
				(idUser, idp, lmk, ltp, estado, producto, stock, precio, descripcion)
					;
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "/registerserv", method = RequestMethod.POST)
	public String regServ(ModelMap modl,
			@RequestParam String servicio, 
			@RequestParam int duracion, 
			@RequestParam double precio, 
			@RequestParam String descripcion,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().regServ(idUser, servicio, duracion, precio, descripcion);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "/updateserv", method = RequestMethod.POST)
	public String updServ(ModelMap modl,
			@RequestParam int ids, 
			@RequestParam int estado, 
			@RequestParam String servicio, 
			@RequestParam int duracion, 
			@RequestParam double precio, 
			@RequestParam String descripcion,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().updtServ
				(idUser, ids, estado, servicio, duracion, precio, descripcion);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "/registerbarb", method = RequestMethod.POST)
	public String regBarb(ModelMap modl,
			@RequestParam String nombre, 
			@RequestParam String apellido, 
			@RequestParam String telefono, 
			@RequestParam String dni, 
			@RequestParam String email, 
			@RequestParam String direccion,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().regBarb(idUser, nombre, apellido, telefono, dni, email, direccion);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "/updatebarb", method = RequestMethod.POST)
	public String updBarb(ModelMap modl,
			@RequestParam int idb, 
			@RequestParam int estado, 
			@RequestParam String nombre, 
			@RequestParam String apellido, 
			@RequestParam String telefono, 
			@RequestParam String dni, 
			@RequestParam String email, 
			@RequestParam String direccion,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().updtBarb
				(idUser, idb, estado, nombre, apellido, telefono, dni, email, direccion);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "/registercli", method = RequestMethod.POST)
	public String regCli(ModelMap modl,
			@RequestParam String nombre, 
			@RequestParam String apellido, 
			@RequestParam String telefono, 
			@RequestParam String dni, 
			@RequestParam String email, 
			@RequestParam String direccion,
			@RequestParam String password,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().regClt(idUser, nombre, apellido, telefono, dni, email, direccion, password);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "/updatecli", method = RequestMethod.POST)
	public String updCli(ModelMap modl,
			@RequestParam int idc, 
			@RequestParam String nombre, 
			@RequestParam String apellido, 
			@RequestParam String telefono, 
			@RequestParam String dni, 
			@RequestParam String email, 
			@RequestParam String direccion,
			@RequestParam int estado,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().updtClt
				(idUser, idc, nombre, apellido, telefono, dni, email, direccion, estado);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "/registermark", method = RequestMethod.POST)
	public String regMark(ModelMap modl,
			@RequestParam String marca,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().regMark(idUser, marca);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	@RequestMapping(value = "updatemark", method = RequestMethod.POST)
	public String updMark(ModelMap modl,
			@RequestParam int idm,
			@RequestParam int estado,
			@RequestParam String marca,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().updtMark
				(idUser, idm, marca, estado);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/registertipo", method = RequestMethod.POST)
	public String regTipo(ModelMap modl,
			@RequestParam String tipo,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().regTipo(idUser, tipo);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/updatetipo", method = RequestMethod.POST)
	public String updTipo(ModelMap modl,
			@RequestParam int idt,
			@RequestParam int estado,
			@RequestParam String tipo,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().updtTipo
				(idUser, idt, tipo, estado);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/deletecli", method = RequestMethod.GET)
	public String delCli(ModelMap modl,
			@RequestParam int id,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().delClt(idUser, id);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/deletebarb", method = RequestMethod.GET)
	public String delBrb(ModelMap modl,
			@RequestParam int id,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().delBarb
				(idUser, id);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/deleteserv", method = RequestMethod.GET)
	public String delSrv(ModelMap modl,
			@RequestParam int id,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().delServ
				(idUser, id);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/deletepro", method = RequestMethod.GET)
	public String delPrd(ModelMap modl,
			@RequestParam int id,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().delProd
								(idUser, id);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/deletemark", method = RequestMethod.GET)
	public String delMrk(ModelMap modl,
			@RequestParam int id,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().delMark
				(idUser, id);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	
	@RequestMapping(value = "/deletetyp", method = RequestMethod.GET)
	public String delTyp(ModelMap modl,
			@RequestParam int id,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
		
		MensajesBeans mesgid = model.getInstance().delTipo
				(idUser, id);
		
		modl.put("successMessage", mesgid.getMensaje());
		
		return "hello";
		
	}
	

	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session, ModelMap modl) throws ServletException, IOException {
		
		//session = request.getSession();
		//int idUser = Integer.parseInt(request.getParameter("idUser"));
		String idUser = request.getParameter("idUser");
		String idP = request.getParameter("idP");
		String idT = request.getParameter("idT");
		String aidi = request.getParameter("aidi");
		String words = request.getParameter("words");
		
		if(idP != null ) {
			session.setAttribute("idP", idP);
			
			if("U".contains(idP)) {
				
				request.getRequestDispatcher("${pageContext.request.contextPath}hello");
				
				if(idT != null ) {
					
					session.setAttribute("idT", idT);
				
					if("R".contains(idT)) {
					
						List<RecuperarTipoUsuario> ltu = model.getInstance().tipousuario();
						modl.put("listatu", ltu);
						
					}
					else if("L".contains(idT)) {
						
						List<ListarUsuarios> luzr = model.getInstance().allUzrs();
						session.setAttribute("listauzr", luzr);

					}
					else if("B".contains(idT)) {
						
						if(words != null ) {
							
							session.setAttribute("words", words);
						
							List<BuscarUsuario> buzr = model.getInstance().uzrbyword(words);
							session.setAttribute("buzkuzr", buzr);
						
						}
						
					}
					else if("A".contains(idT)) {
						
						
						if (aidi != null) {
							
							session.setAttribute("aidi", aidi);
							int it = Integer.parseInt(aidi);
							List<RecuperarUsuario> rqu = model.getInstance().getUzr(it);
							session.setAttribute("rquzr", rqu);
														
						}
						
						
					}
					
					
				}
				
			}
			else if("P".contains(idP)) {
				
				request.getRequestDispatcher("${pageContext.request.contextPath}hello");
				
				if(idT != null ) {
					
					session.setAttribute("idT", idT);
				
					if("R".contains(idT)) {
						
						List<ListarMarca> lmk = model.getInstance().allMark();
						List<ListarTipo> ltp = model.getInstance().allTipo();
						
						session.setAttribute("listamk", lmk);
						session.setAttribute("listatp", ltp);
						
					}
					else if("L".contains(idT)) {
						
						List<ListarProductoInterno> lpr = model.getInstance().allProd();
						session.setAttribute("listapr", lpr);					
						
					}						
					else if("B".contains(idT)) {
						
						if(words != null ) {
							
							session.setAttribute("words", words);
						
							List<BuscarProductoInterno> buzr = model.getInstance().prodbyword
									(words);
							session.setAttribute("buzkpro", buzr);
						
						}
						
					}
					else if("A".contains(idT)) {
						
						
						if (aidi != null) {
							
							session.setAttribute("aidi", aidi);
							int it = Integer.parseInt(aidi);
							List<RecuperarProducto> mesgid = model.getInstance().getProd(it);
							session.setAttribute("reqpro", mesgid);
							List<ListarMarca> lmk = model.getInstance().allMark();
							List<ListarTipo> ltp = model.getInstance().allTipo();
							session.setAttribute("listamk", lmk);
							session.setAttribute("listatp", ltp);
														
						}
						
						
					}
				}
				
			}
			else if("B".contains(idP)) {
				
				request.getRequestDispatcher("${pageContext.request.contextPath}hello");
				
				if(idT != null ) {
					
					session.setAttribute("idT", idT);
					
					if("R".contains(idT)) {
						

						
					}	
					else if("L".contains(idT)) {
						
						List<ListarBarberoInterno> lbr = model.getInstance().allBarbs();
						session.setAttribute("listabr", lbr);					
						
					}					
					else if("A".contains(idT)) {
						
						if (aidi != null) {
							
							session.setAttribute("aidi", aidi);
							int it = Integer.parseInt(aidi);
							List<RecuperarBarbero> mesgid = model.getInstance().getBarb(it);
							session.setAttribute("reqbrb", mesgid);
														
						}
						
						
					}
					else if("B".contains(idT)) {
						
						if(words != null ) {
							
							session.setAttribute("words", words);
						
							List<BuscarBarberoInterno> buzr = model.getInstance().barbbyword
									(words);
							session.setAttribute("buzkbarb", buzr);
						
						}
						
					}
					
				}
				
			}
			else if("S".contains(idP)) {
				
				request.getRequestDispatcher("${pageContext.request.contextPath}hello");
				
				if(idT != null ) {
					
					session.setAttribute("idT", idT);
					
					if("R".contains(idT)) {
						

						
					}
					else if("L".contains(idT)) {
						
						List<ListarServicioInterno> lsv = model.getInstance().allServ();
						session.setAttribute("listasv", lsv);					
						
					}					
					else if("B".contains(idT)) {
						
						if(words != null ) {
							
							session.setAttribute("words", words);
						
							List<BuscarServicioInterno> buzr = model.getInstance().servbyword
									(words);
							session.setAttribute("buzserv", buzr);
						
						}
						
					}
					
					else if("A".contains(idT)) {
						
						if (aidi != null) {
							
							session.setAttribute("aidi", aidi);
							int it = Integer.parseInt(aidi);
							List<RecuperarServicio> rsv = model.getInstance().getServ(it);
							session.setAttribute("reqserv", rsv);
														
						}
						
						
					}
					
				}
				
			}
			else if("M".contains(idP)) {
				
				request.getRequestDispatcher("${pageContext.request.contextPath}hello");
				
				if(idT != null ) {
					
					session.setAttribute("idT", idT);
					
					if("R".contains(idT)) {
						
					
					}
					else if("L".contains(idT)) {
						
						List<ListarMarca> lmk = model.getInstance().allMark();
						session.setAttribute("listamk", lmk);				
						
					}						
					
					else if("A".contains(idT)) {
						
						
						if (aidi != null) {
							
							session.setAttribute("aidi", aidi);
							int it = Integer.parseInt(aidi);
							List<RecuperarMarca> mesgid = model.getInstance().getMark(it);
							session.setAttribute("reqmark", mesgid);
														
						}
						
						
					}
					
				}
				
			}
			else if("T".contains(idP)) {
				
				request.getRequestDispatcher("${pageContext.request.contextPath}hello");
				
				if(idT != null ) {
					
					session.setAttribute("idT", idT);
					
					if("R".contains(idT)) {
						
						
						
					}	
					else if("L".contains(idT)) {
						
						List<ListarTipo> ltp = model.getInstance().allTipo();
						session.setAttribute("listatp", ltp);;					
						
					}
					
					else if("A".contains(idT)) {
						
						
						if (aidi != null) {
							
							session.setAttribute("aidi", aidi);
							int it = Integer.parseInt(aidi);
							List<RecuperarTipo> mesgid = model.getInstance().getTipo(it);
							session.setAttribute("reqtp", mesgid);
														
						}
						
						
					}
					
				}
				
			}
			else if("C".contains(idP)) {
				
				request.getRequestDispatcher("${pageContext.request.contextPath}hello");
				
				if(idT != null ) {
					
					session.setAttribute("idT", idT);
					
					if("R".contains(idT)) {

						
						
					}	
					else if("L".contains(idT)) {
						
						List<ListarClienteInterno> lcl = model.getInstance().allClients();
						session.setAttribute("listac", lcl);					
						
					}	
					else if("B".contains(idT)) {
						
						if(words != null ) {
							
							session.setAttribute("words", words);
						
							List<BuscarClienteInterno> buzr = model.getInstance().cltbyword
									(words);
							session.setAttribute("buzkclt", buzr);
						
						}
						
					}
					
					else if("A".contains(idT)) {
						
						
						if (aidi != null) {
							
							session.setAttribute("aidi", aidi);
							int it = Integer.parseInt(aidi);
							List<RecuperarClienteInterno> mesgid = model.getInstance().getClt(it);
							session.setAttribute("reqclnt", mesgid);
														
						}
						
						
					}
					
				}
				
			}
			
		}
		
		return "hello";
	}

}
