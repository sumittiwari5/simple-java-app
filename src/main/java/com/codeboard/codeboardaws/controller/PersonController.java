package com.codeboard.codeboardaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class PersonController {

	@GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	public String index() {
		StringBuilder html = new StringBuilder();
		html.append("<!DOCTYPE html>");
		html.append("<html lang='en'>");
		html.append("<head>");
		html.append("<meta charset='UTF-8'>");
		html.append("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		html.append("<title>Person Controller Dashboard</title>");
		html.append("<style>");
		html.append("* { margin: 0; padding: 0; box-sizing: border-box; }");
		html.append("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); min-height: 100vh; display: flex; justify-content: center; align-items: center; padding: 20px; }");
		html.append(".container { background: rgba(255, 255, 255, 0.95); border-radius: 20px; box-shadow: 0 20px 60px rgba(0, 0, 0, 0.3); padding: 40px; max-width: 500px; width: 100%; backdrop-filter: blur(10px); }");
		html.append("h1 { color: #667eea; margin-bottom: 10px; font-size: 2em; text-align: center; }");
		html.append(".subtitle { color: #666; text-align: center; margin-bottom: 30px; font-size: 0.9em; }");
		html.append(".button { width: 100%; padding: 15px 30px; font-size: 1.1em; font-weight: 600; color: white; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); border: none; border-radius: 50px; cursor: pointer; transition: all 0.3s ease; box-shadow: 0 4px 15px rgba(102, 126, 234, 0.4); }");
		html.append(".button:hover { transform: translateY(-2px); box-shadow: 0 6px 20px rgba(102, 126, 234, 0.6); }");
		html.append(".button:active { transform: translateY(0); }");
		html.append(".response-box { margin-top: 30px; padding: 20px; background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%); border-radius: 15px; min-height: 80px; display: flex; align-items: center; justify-content: center; opacity: 0; transform: translateY(20px); transition: all 0.5s ease; }");
		html.append(".response-box.show { opacity: 1; transform: translateY(0); }");
		html.append(".response-text { color: #333; font-size: 1.2em; font-weight: 500; text-align: center; }");
		html.append(".loading { display: inline-block; width: 20px; height: 20px; border: 3px solid rgba(102, 126, 234, 0.3); border-radius: 50%; border-top-color: #667eea; animation: spin 1s ease-in-out infinite; }");
		html.append("@keyframes spin { to { transform: rotate(360deg); } }");
		html.append(".info { margin-top: 20px; padding: 15px; background: rgba(102, 126, 234, 0.1); border-left: 4px solid #667eea; border-radius: 5px; font-size: 0.85em; color: #555; }");
		html.append("</style>");
		html.append("</head>");
		html.append("<body>");
		html.append("<div class='container'>");
		html.append("<h1>🚀 CodeBoard AWS</h1>");
		html.append("<p class='subtitle'>Spring Boot REST API Demo</p>");
		html.append("<button class='button' onclick='fetchName()'>Get Name from API</button>");
		html.append("<div id='response' class='response-box'><div class='response-text'>Click the button to fetch data</div></div>");
		html.append("<div class='info'><strong>Endpoint:</strong> /getname<br><strong>Method:</strong> GET<br><strong>Status:</strong> <span id='status'>Ready</span></div>");
		html.append("</div>");
		html.append("<script>");
		html.append("async function fetchName() {");
		html.append("  var responseBox = document.getElementById('response');");
		html.append("  var statusEl = document.getElementById('status');");
		html.append("  responseBox.innerHTML = '<div class=\"loading\"></div>';");
		html.append("  responseBox.classList.add('show');");
		html.append("  statusEl.textContent = 'Loading...';");
		html.append("  try {");
		html.append("    var response = await fetch('/getname');");
		html.append("    var data = await response.text();");
		html.append("    responseBox.innerHTML = '<div class=\"response-text\">✨ ' + data + '</div>';");
		html.append("    statusEl.textContent = 'Success';");
		html.append("  } catch (error) {");
		html.append("    responseBox.innerHTML = '<div class=\"response-text\">❌ Error: ' + error.message + '</div>';");
		html.append("    statusEl.textContent = 'Error';");
		html.append("  }");
		html.append("}");
		html.append("</script>");
		html.append("</body>");
		html.append("</html>");
		return html.toString();
	}

	@GetMapping("/getname")
	public String getName() {
		return "hello from the mantasha!!!";
	}
}