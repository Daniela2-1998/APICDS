package tucd.APICDS.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tucd.APICDS.repository.CDRepository;

@Service
public class CDService {

    @Autowired
    CDRepository cdRepository;

    @Autowired

}
