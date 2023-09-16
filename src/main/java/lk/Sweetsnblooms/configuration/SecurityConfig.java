/*package lk.Sweetsnblooms.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration/*
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)*/
/*public class SecurityConfig {
    /*@Autowired
    GoogleOAuth2SuccessHandler googleOAuth2SuccessHandler;

    
        @Autowired
        CustomUserDetailService customUserDetailService;
        @Autowired
        private BCryptPasswordEncoder bCryptPasswordEncoder;
    
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                .antMatchers("/", "/shop/**", "/forgotpassword", "/register", "/h2-console/**").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .failureUrl("/login?error=true")
                .defaultSuccessUrl("/")
                .usernameParameter("email")
                .passwordParameter("password")
                .and()
                .oauth2Login()
                .loginPage("/login")
                .successHandler(googleOAuth2SuccessHandler)
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .and()
                .exceptionHandling()
                .and()
                .csrf().disable()
                .headers().frameOptions().disable()
                .and();
        }

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
   @Bean
    DefaultRedirectStrategy redirectStrategy() {
        return new DefaultRedirectStrategy();
    }

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailService).passwordEncoder(bCryptPasswordEncoder());
    }

  

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**", "/static/**", "/images/**", "/productimages/**", "/css/**", "/js/**");
    }
}*/