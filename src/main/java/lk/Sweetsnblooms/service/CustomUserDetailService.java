/*package lk.Sweetsnblooms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lk.Sweetsnblooms.model.CustomUserDetails;
import lk.Sweetsnblooms.model.User;
import lk.Sweetsnblooms.repository.UserRepository;

@Service
public class CustomUserDetailService  implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> user=userRepository.findUserByEmail(email);
		user.orElseThrow(()->new UsernameNotFoundException("user not found"));
		return user.map(CustomUserDetails::new).get();
	}

	
}
*/