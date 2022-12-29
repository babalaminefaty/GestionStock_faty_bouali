//
//package sn.faty.gestionstock.config;
//
//import org.slf4j.MDC;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.filter.OncePerRequestFilter;
//import sn.faty.gestionstock.service.JwtUtil;
//import sn.faty.gestionstock.service.auth.AuthService;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//@Component
//public class RequestFilter  extends OncePerRequestFilter {
//@Autowired
//    private JwtUtil jwtUtil ;
//@Autowired
//    private AuthService authService ;
//@Autowired
//    public RequestFilter(JwtUtil jwtUtil,AuthService authService) {
//        this.jwtUtil = jwtUtil;
//        this.authService=authService;
//    }
//
//    @Override
//   protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
//
//     final  String authHeader=request.getHeader("Authorization");
//
//        String username=null ;
//        String jwt=null ;
//        String idEntreprise=null ;
//
//      if(StringUtils.hasLength(authHeader) && authHeader.startsWith("Bearer ")){
//       jwt= authHeader.substring(7);
//       username=jwtUtil.extractUsername(jwt);
//       idEntreprise = jwtUtil.extractIdEntreprise(jwt);
//  }
//      if(StringUtils.hasLength(username) && SecurityContextHolder.getContext().getAuthentication()==null){
//
//        UserDetails userDetails= authService.loadUserByUsername(username);
//           if(jwtUtil.validateToken(jwt,userDetails)){
//
//               UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
//
//            usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//            }
//
//      }
//       MDC.put("idEntreprise",idEntreprise);
//      chain.doFilter(request,response);
// }
//}
//
