package org.test.strut;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * ÉÏ´«Action
 * @author Administrator
 *
 */
public class UploadTestAction extends Action {

	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UploadActionForm uaf = (UploadActionForm)form;
		System.out.println("title=" + uaf.getTitle());
		System.out.println("fileName=" + uaf.getMyfile().getFileName());
		FileOutputStream fos = new FileOutputStream("" + uaf.getMyfile().getFileName());
		fos.write(uaf.getMyfile().getFileData());
		fos.flush();
		fos.close();
		return mapping.findForward("success");
	}

}
