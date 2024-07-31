package com.Danny.SpringBootLearning.Day4_SpringProfile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("aws") //Chỉ chạy khi profile aws được active
public class OnlyAWS {
}
