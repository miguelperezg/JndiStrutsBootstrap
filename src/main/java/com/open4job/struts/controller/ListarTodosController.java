package com.open4job.struts.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.open4job.struts.model.dao.BaseDatosDirecta;
import com.open4job.struts.model.dao.ParadaTaxiDAO;
import com.open4job.struts.model.vo.ParadaTaxiVO;

public class ListarTodosController extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		BaseDatosDirecta bbdd = new BaseDatosDirecta();
		// Connection conexion = bbdd.abrirConexion().getConnection();
		ParadaTaxiDAO paradasTaxi = new ParadaTaxiDAO();
		ArrayList<ParadaTaxiVO> listaParadas = paradasTaxi
				.getListadoParadaTaxi(bbdd);
		request.setAttribute("listaParadas", listaParadas);
		
		return mapping.findForward("success");
	}

}
