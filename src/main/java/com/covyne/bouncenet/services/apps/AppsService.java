package com.covyne.bouncenet.services.apps;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppsService {

    private final AppRepository appRepository;


    public AppsService(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    public List<App> findAll() {
        return appRepository.findAll();
    }

    public App addApp(App app) {
        return appRepository.save(app);
    }

    public App update(App app) {
        return appRepository.save(app);
    }

    public void delete(App app) {
        appRepository.delete(app);
    }

}
