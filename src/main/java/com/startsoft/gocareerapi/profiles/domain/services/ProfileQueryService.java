package com.startsoft.gocareerapi.profiles.domain.services;

import com.startsoft.gocareerapi.profiles.domain.model.aggregates.Profile;
import com.startsoft.gocareerapi.profiles.domain.model.queries.GetAllProfilesQuery;
import com.startsoft.gocareerapi.profiles.domain.model.queries.GetProfileByEmailQuery;
import com.startsoft.gocareerapi.profiles.domain.model.queries.GetProfileByIdQuery;

import java.util.List;
import java.util.Optional;

public interface ProfileQueryService {

    Optional<Profile> handle(GetProfileByEmailQuery query);

    Optional<Profile> handle(GetProfileByIdQuery query);

    List<Profile> handle(GetAllProfilesQuery query);
}
