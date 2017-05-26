/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanpaoloimi.jasperreportsfont;

import java.util.HashMap;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author tania
 */
public class Main {

    public static void main(String[] args) throws JRException {
        final JasperReport report = JasperCompileManager.compileReport(Main.class.getResourceAsStream("/templates/test.jrxml"));
        JasperPrint print = JasperFillManager.fillReport(report, new HashMap<String, Object>(), new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(print, "report.pdf");
    }

}
