//package com.jaswine.core.filters;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.SecurityMetadataSource;
//import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
//import org.springframework.security.access.intercept.InterceptorStatusToken;
//import org.springframework.security.web.FilterInvocation;
//import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import java.io.IOException;
//
///**
// * 自定义的拦截器
// *
// * @author Jasmine
// */
//@Component
//public class SecurityFilter extends AbstractSecurityInterceptor implements Filter {
//
//	@Autowired
//	private FilterInvocationSecurityMetadataSource securityMetadataSource;
//
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		FilterInvocation fi = new FilterInvocation(request, response, chain);
//		invoke(fi);
//	}
//
//	@Override
//	public void destroy() {
//
//	}
//
//	@Override
//	public Class<?> getSecureObjectClass() {
//		return FilterInvocation.class;
//	}
//
//	@Override
//	public SecurityMetadataSource obtainSecurityMetadataSource() {
//		return this.securityMetadataSource;
//	}
//
//	public void invoke(FilterInvocation fi) {
//		InterceptorStatusToken token = super.beforeInvocation(fi);
//		try {
//			fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ServletException e) {
//			e.printStackTrace();
//		} finally {
//			super.afterInvocation(token, null);
//		}
//	}
//}
